import dayjs from 'dayjs';
import { IComment } from 'app/shared/model/comment.model';
import { IAuthor } from 'app/shared/model/author.model';
import { IGenre } from 'app/shared/model/genre.model';

export interface IBook {
  id?: number;
  name?: string | null;
  publicationDate?: dayjs.Dayjs | null;
  comments?: IComment[] | null;
  author?: IAuthor | null;
  genre?: IGenre | null;
}

export const defaultValue: Readonly<IBook> = {};
